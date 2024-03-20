package com.crudperson.people.service;


import java.util.List;

import com.crudperson.people.dto.request.PersonRequestDTO;
import com.crudperson.people.dto.response.PersonResponseDTO;

public interface PersonService {

    PersonResponseDTO findById(Long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(PersonRequestDTO personDTO);

    PersonResponseDTO update(Long id, PersonRequestDTO personDTO);

    String delete(Long id);

}
