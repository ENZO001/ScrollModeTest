package com.ctbc.pcms.model.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctbc.pcms.model.vo.PCMS_FLOW_MAIN_VO;

@Service
public class CommonFlowService {

	@Autowired
	private SessionFactory sessionFactory;

	public void insertFlowMain() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		for (int i = 0; i < 100000; i++) {
			PCMS_FLOW_MAIN_VO pcmsFlowMainVO = new PCMS_FLOW_MAIN_VO();
			pcmsFlowMainVO.setCustomerName("APPLE");
			session.save(pcmsFlowMainVO);
			if (i % 100 == 0) {
				session.flush();
			}
		}
		session.getTransaction().commit();
	}
	
	public void getFlowMain() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		String sql = "Select * from pcms_flow_main";
		SQLQuery query = session.createSQLQuery(sql);
//		List list = query.list();
		ScrollableResults rs = query.scroll(ScrollMode.SCROLL_INSENSITIVE);
		rs.last();
		int xx = rs.getRowNumber() +1;
		System.out.println(xx);
		rs.beforeFirst();
		int i = 0;
		while (rs.next() && i < 10) {
			System.out.println(rs.get());
			i++;
		}
//		rs.get(1);
		session.getTransaction().commit();
	}
}
