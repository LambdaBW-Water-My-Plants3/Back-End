package com.lambdaschool.watermyplants;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import com.lambdaschool.watermyplants.models.*;
import com.lambdaschool.watermyplants.services.RoleService;
import com.lambdaschool.watermyplants.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Locale;

/**
 * SeedData puts both known and random data into the database. It implements CommandLineRunner.
 * <p>
 * CoomandLineRunner: Spring Boot automatically runs the run method once and only once
 * after the application context has been loaded.
 */
@Transactional
@Component
public class SeedData
        implements CommandLineRunner
{
    /**
     * Connects the Role Service to this process
     */
    @Autowired
    RoleService roleService;

    /**
     * Connects the user service to this process
     */
    @Autowired
    UserService userService;

    /**
     * Generates test, seed data for our application
     * First a set of known data is seeded into our database.
     * Second a random set of data using Java Faker is seeded into our database.
     * Note this process does not remove data from the database. So if data exists in the database
     * prior to running this process, that data remains in the database.
     *
     * @param args The parameter is required by the parent interface but is not used in this process.
     */
    @Transactional
    @Override
    public void run(String[] args) throws
            Exception
    {
        userService.deleteAll();
        roleService.deleteAll();
        Role r1 = new Role("admin");
        Role r2 = new Role("user");
        Role r3 = new Role("data");

        r1 = roleService.save(r1);
        r2 = roleService.save(r2);
        r3 = roleService.save(r3);

        // admin, data, user
        User u1 = new User("admin",
                           "password",
                           "admin@lambdaschool.local");
        u1.getRoles()
                .add(new UserRoles(u1, r1));
        u1.getRoles()
                .add(new UserRoles(u1, r2));
        u1.getRoles()
                .add(new UserRoles(u1, r3));
        u1.getUseremails()
                .add(new Useremail(u1,
                                   "admin@email.local"));
        u1.getUseremails()
                .add(new Useremail(u1,
                                   "admin@mymail.local"));



        // data, user
        User u2 = new User("test user",
                           "testuser1234",
                           "cinnamon@lambdaschool.local");
        u2.getRoles()
                .add(new UserRoles(u2, r2));
        u2.getRoles()
                .add(new UserRoles(u2, r3));
        u2.getUseremails()
                .add(new Useremail(u2,
                                   "cinnamon@mymail.local"));
        u2.getUseremails()
                .add(new Useremail(u2,
                                   "hops@mymail.local"));
        u2.getUseremails()
                .add(new Useremail(u2,
                                   "bunny@email.local"));


        // user
        User u3 = new User("datatest",
                           "testdata1234",
                           "barnbarn@lambdaschool.local");
        u3.getRoles()
                .add(new UserRoles(u3, r2));
        u3.getUseremails()
                .add(new Useremail(u3,
                                   "barnbarn@email.local"));

        Plant p1 = new Plant("Bunny Ears Cactus","Cactus","1x weekly","https" +
                "://images.unsplash.com/photo-1573692822546-99d57af10a33" +
                "?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit" +
                "=crop&w=634&q=80",u1);


        Plant p2 = new Plant("Jumping Chola","Cactus","1x weekly","https" +
                "://images.unsplash.com/photo-1539571711714-62cd2534f96e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1267&q=80",u1);


        Plant p3 = new Plant("Giant Timber Bamboo","Bamboo","5x weekly",
                "https://images.unsplash.com/photo-1510398462662-b28a5183460d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80",u1);


        Plant p4 = new Plant("ShamePlant","Mimosa Pudica","Keep Soil Moist, " +
                "but not water logged","https" +
                "://images.unsplash.com/photo-1573692822546-99d57af10a33" +
                "?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit" +
                "=crop&w=634&q=80",u1);


        Plant p5 = new Plant("Cattleya Orchid","Orchid","Water when potting " +
                "Medium is dry",
                "https" +
                "://images.unsplash.com/photo-1534885320675-b08aa131cc5e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80",u1);


        Plant p6 = new Plant("ButterHead Lettuce","Lettuce","twice weekly",
                "https://images.unsplash.com/photo-1556801712-76c8eb07bbc9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=925&q=80",u1);


        Plant p7 = new Plant("Romaine Lettuce","Lettuce","twice weekly",
                "https://images.unsplash.com/photo-1582726458086-30eef5a7ef89?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80",u2);


        Plant p8 = new Plant("Batavia Lettuce","Lettuce","twice weekly",
                "https://images.unsplash.com/photo-1598998255396-9c0289d33304?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1868&q=80",u2);

        u1.getPlants().add(p1);
        u1.getPlants().add(p2);
        u1.getPlants().add(p3);
        u1.getPlants().add(p4);
        u1.getPlants().add(p5);
        u1.getPlants().add(p6);
        u2.getPlants().add(p7);
        u2.getPlants().add(p8);

        userService.save(u1);
        userService.save(u2);
        userService.save(u3);
        userService.save(u4);
        userService.save(u5);

//        if (false)
//        {
//            // using JavaFaker create a bunch of regular users
//            // https://www.baeldung.com/java-faker
//            // https://www.baeldung.com/regular-expressions-java
//
//            FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-US"),
//                                                                        new RandomService());
//            Faker nameFaker = new Faker(new Locale("en-US"));
//
//            for (int i = 0; i < 25; i++)
//            {
//                new User();
//                User fakeUser;
//
//                fakeUser = new User(nameFaker.name()
//                                            .username(),
//                                    "password",
//                                    nameFaker.internet()
//                                            .emailAddress());
//                fakeUser.getRoles()
//                        .add(new UserRoles(fakeUser, r2));
//                fakeUser.getUseremails()
//                        .add(new Useremail(fakeUser,
//                                           fakeValuesService.bothify("????##@gmail.com")));
//                userService.save(fakeUser);
//            }
//        }
    }
}