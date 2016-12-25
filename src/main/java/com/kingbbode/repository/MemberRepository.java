package com.kingbbode.repository;

import com.kingbbode.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by YG-MAC on 2016. 12. 25..
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}
