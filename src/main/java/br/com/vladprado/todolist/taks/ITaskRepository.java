package br.com.vladprado.todolist.taks;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface ITaskRepository extends JpaRepository<TaksModel, UUID> {
    List<TaksModel> findByIdUser(UUID idUser);
}
