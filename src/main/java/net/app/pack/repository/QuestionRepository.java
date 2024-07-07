package net.app.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.app.pack.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
