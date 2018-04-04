package org.myproject.library.library.repository;

import org.myproject.library.library.entity.PublishingHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishingHouseRepository extends JpaRepository<PublishingHouse, Long> {
}
