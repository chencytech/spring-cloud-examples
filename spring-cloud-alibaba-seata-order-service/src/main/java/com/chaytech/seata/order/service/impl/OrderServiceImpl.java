package com.chaytech.seata.order.service.impl;

import com.chaytech.api.seata.SeataAccountApi;
import com.chaytech.api.seata.SeataStorageApi;
import com.chaytech.seata.order.dao.OrderDao;
import com.chaytech.seata.order.domain.Order;
import com.chaytech.seata.order.service.IOrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/29 17:17
 */
@Service
public class OrderServiceImpl implements IOrderService {

    private static final Logger Logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private SeataStorageApi storageApi;
    @Autowired
    private SeataAccountApi accountApi;

    @Override
    public Order getOrderById(Long id) {
        return orderDao.getOrderById(id);
    }

    @GlobalTransactional(rollbackFor = Exception.class)
    @Override
    public void createOrder(Order order) {

        Logger.info("-----------> create order start");
        orderDao.createOrder(order);
        Logger.info("-----------> create order end orderId：{}", order.getId());

        Logger.info("-----------> decrease storage count start");
        storageApi.decrease(order.getProductId(), order.getCount());
        Logger.info("-----------> decrease storage count end productId：[{}],count：[{}]", order.getProductId(), order.getCount());

        Logger.info("-----------> decrease account monty start");
        accountApi.decrease(order.getUserId(), order.getMoney());
        Logger.info("-----------> decrease account monty end userId：[{}],money：[{}]", order.getUserId(), order.getMoney());

        Logger.info("-----------> update order status start");
        orderDao.updateOrderStatus(order.getId(),1);
        Logger.info("-----------> update order status end orderId：{}", order.getId());


        Logger.info("-----------> order process success orderId：{}", order.getId());
    }
}
