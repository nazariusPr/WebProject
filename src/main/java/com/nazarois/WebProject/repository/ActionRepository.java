package com.nazarois.WebProject.repository;

import com.nazarois.WebProject.model.Action;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends JpaRepository<Action, UUID> {}
