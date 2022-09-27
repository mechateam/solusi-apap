package apap.tutorial.belajarbelajar.service;

import apap.tutorial.belajarbelajar.model.PengajarModel;
import apap.tutorial.belajarbelajar.repository.PengajarDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PengajarServiceImpl implements PengajarService{
    @Autowired
    PengajarDb pengajarDb;

    @Override
    public void addPengajar(PengajarModel pengajar) {
        pengajarDb.save(pengajar);
    }
}
