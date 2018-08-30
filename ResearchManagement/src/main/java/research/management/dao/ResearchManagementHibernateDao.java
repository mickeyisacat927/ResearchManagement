package main.java.research.management.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import main.java.research.management.model.Papers;

@Service
public class ResearchManagementHibernateDao extends HibernateDaoSupport implements IResearchManagementDao{

	@Autowired
    public void anyMethodName(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }
	
	@Override
	public List<Papers> ListPapers() {
		// TODO Auto-generated method stub
		return (List<Papers>) getHibernateTemplate().find("from Papers");
	}

	@Override
	public Papers getPaper(Integer id) {
		// TODO Auto-generated method stub
		return (Papers) getHibernateTemplate().get(Papers.class, id);
	}
	

}
