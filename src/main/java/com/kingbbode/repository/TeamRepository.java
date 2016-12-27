package com.kingbbode.repository;

import com.kingbbode.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by YG-MAC on 2016. 12. 25..
 */
@Transactional
public interface TeamRepository extends JpaRepository<Team, Long> {
}
