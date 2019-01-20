package com.mzapart.carrental;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CarRepository extends CrudRepository<Car, String> {

}
