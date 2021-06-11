package com.codeup.springblog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad, Long> {
    //you can create method in the interface as well
    // This is an example of what other method you can use and call in the controller
    //For example
    Ad findByTitle(String title);// This will be found in the AdController

    Ad findByTitleLike(String searchPattern); // find by title INPUT and this will be found in the AdController as well
}
//Make a controller afterward