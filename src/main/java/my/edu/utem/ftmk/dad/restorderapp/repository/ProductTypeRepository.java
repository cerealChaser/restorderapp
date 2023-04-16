package my.edu.utem.ftmk.dad.restorderapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.edu.utem.ftmk.dad.restorderapp.model.ProductType;

//To extend the spring Repository class 
@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Long>{

}
