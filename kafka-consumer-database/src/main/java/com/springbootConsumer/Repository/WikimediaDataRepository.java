package com.springbootConsumer.Repository;

import com.springbootConsumer.Entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData,Long> {

}
