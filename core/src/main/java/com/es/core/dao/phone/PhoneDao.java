package com.es.core.dao.phone;

import com.es.core.model.phone.Phone;

import java.util.List;
import java.util.Optional;

public interface PhoneDao {
    Optional<Phone> get(Long key);
    void save(Phone phone);
    List<Phone> findAll(int offset, int limit, String search, String sort, String direction);
    void delete(Phone phone);
    int getNumberAvailablePhones(String search);
    boolean contains(Long key);
    long getMaxPhoneId();
    long getCountPhones();
}
