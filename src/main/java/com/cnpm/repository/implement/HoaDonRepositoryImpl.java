package com.cnpm.repository.implement;

import com.cnpm.pojos.Account;
import com.cnpm.pojos.HoaDon;
import com.cnpm.repository.AccountRepository;
import com.cnpm.repository.HoaDonRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
@Transactional
public class HoaDonRepositoryImpl implements HoaDonRepository {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public boolean add(HoaDon hoaDon) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        session.save(hoaDon);
        return true;

    }

    @Override
    public boolean delete(int idHoaDon) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        HoaDon hoaDon =this.getOne(idHoaDon);
        session.delete(hoaDon);
        return false;
    }

    @Override
    public HoaDon getOne(int id) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        return session.get(HoaDon.class,id);
    }

    @Override
    public List<HoaDon> getList(String idKhachHang) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery query = builder.createQuery(HoaDon.class);
        Root root = query.from(HoaDon.class);
        query = query.select(root);
        List<Account> acc = this.accountRepository.getAccount(idKhachHang);
        Predicate p = builder.equal(root.get("idKhachHang").as(Account.class),acc.get(0));
        query =query.where(p);
        Query q = session.createQuery(query);
        return q.getResultList();
    }

    @Override
    public boolean update(HoaDon hoaDon) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        session.update(hoaDon);
        return true;
    }
}
