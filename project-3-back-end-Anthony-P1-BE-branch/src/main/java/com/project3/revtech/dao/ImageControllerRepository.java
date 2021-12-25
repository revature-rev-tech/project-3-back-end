package com.project3.revtech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project3.revtech.controller.entity.Image;

public interface ImageControllerRepository extends JpaRepository<Image, Integer> {

}
