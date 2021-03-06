package com.fengdu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengdu.dao.OrderGoodsDao;
import com.fengdu.entity.OrderGoodsEntity;
import com.fengdu.service.OrderGoodsService;

import java.util.List;
import java.util.Map;


@Service("orderGoodsService")
public class OrderGoodsServiceImpl implements OrderGoodsService {
	@Autowired
	private OrderGoodsDao orderGoodsDao;
	
	@Override
	public OrderGoodsEntity queryObject(Integer id){
		return orderGoodsDao.queryObject(id);
	}
	
	@Override
	public List<OrderGoodsEntity> queryList(Map<String, Object> map){
		return orderGoodsDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return orderGoodsDao.queryTotal(map);
	}
	
	@Override
	public void save(OrderGoodsEntity orderGoods){
		orderGoodsDao.save(orderGoods);
	}
	
	@Override
	public void update(OrderGoodsEntity orderGoods){
		orderGoodsDao.update(orderGoods);
	}
	
	@Override
	public void delete(Integer id){
		orderGoodsDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		orderGoodsDao.deleteBatch(ids);
	}
	
}
