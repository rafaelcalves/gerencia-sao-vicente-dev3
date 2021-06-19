package com.unisinos.gerenciarsaofrancisco.service.impls;

import com.unisinos.gerenciarsaofrancisco.daos.CreditDao;
import com.unisinos.gerenciarsaofrancisco.forms.CreditForm;
import com.unisinos.gerenciarsaofrancisco.models.Credit;
import com.unisinos.gerenciarsaofrancisco.populators.impls.CreditPopulator;
import com.unisinos.gerenciarsaofrancisco.service.CreditService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DefaultCreditService implements CreditService {

    @Resource
    private CreditDao creditDao;
    @Resource
    private CreditPopulator creditPopulator;

    @Override
    public void saveOrUpdate(Credit user) {
        creditDao.saveOrUpdate(user);
    }


    @Override
    public void saveFromForm(CreditForm creditForm) {
        Credit credit = new Credit();
        creditPopulator.populate(creditForm,credit);
        saveOrUpdate(credit);
    }

    @Override
    public Credit findByCard(String card) {
        return creditDao.findByCard(card);
    }

    @Override
    public Credit findById(int id) {
        return creditDao.findById(id);
    }

}
