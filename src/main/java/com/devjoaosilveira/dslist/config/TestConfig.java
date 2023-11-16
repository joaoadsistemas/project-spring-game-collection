package com.devjoaosilveira.dslist.config;

import com.devjoaosilveira.dslist.entities.Belonging;
import com.devjoaosilveira.dslist.entities.Game;
import com.devjoaosilveira.dslist.entities.GameList;
import com.devjoaosilveira.dslist.repositories.BelongingRepository;
import com.devjoaosilveira.dslist.repositories.GameListRepository;
import com.devjoaosilveira.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private BelongingRepository belongingRepository;

    @Override
    public void run(String... args) throws Exception {

        gameRepository.deleteAll();
        gameListRepository.deleteAll();
        belongingRepository.deleteAll();


        var l1 = new GameList(null, "Aventura e RPG");
        var l2 = new GameList(null, "Jogos de plataforma");

        gameListRepository.saveAll(Arrays.asList(l1,l2));

        var g1 = new Game(null, "Mass Effect Trilogy", 2012, "Role-playing (RPG), Shooter","XBox, Playstation, PC", 4.8, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png", "Lorem " +
                "ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non " +
                "quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. " +
                "Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        var g2 = new Game(null, "Red Dead Redemption 2", 2018, "Role-playing (RPG), Adventure","XBox, Playstation, PC",
                4.7, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/2.png", "Lorem " +
                "ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non " +
                "quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. " +
                "Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        var g3 = new Game(null, "The Witcher 3: Wild Hunt", 2014, "Role-playing (RPG), Adventure","XBox, Playstation," +
                " PC",
                4.7, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/3.png", "Lorem " +
                "ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non " +
                "quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. " +
                "Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        var g4 = new Game(null, "Sekiro: Shadows Die Twice", 2019, "Role-playing (RPG), Adventure","XBox, " +
                "Playstation," +
                " PC",
                4.7, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/4.png", "Lorem " +
                "ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non " +
                "quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. " +
                "Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        var g5 = new Game(null, "Ghost of Tsushima", 2012, "Role-playing (RPG), Adventure","XBox, " +
                "Playstation," +
                " PC",
                4.6, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/5.png", "Lorem " +
                "ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non " +
                "quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. " +
                "Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        var g6 = new Game(null, "Super Mario World", 1990, "Platform", "Super Ness, PC",
                4.6, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/6.png", "Lorem " +
                "ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non " +
                "quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. " +
                "Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        var g7 = new Game(null, "Hollow Knight", 2016, "Platform", "XBox, Playstation, PC",
                4.6, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/7.png", "Lorem " +
                "ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non " +
                "quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. " +
                "Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");


        var g8 = new Game(null, "Ori and the Blind Forest", 2015, "Platform", "XBox, Playstation, PC",
                4.0, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/8.png", "Lorem " +
                "ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non " +
                "quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. " +
                "Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");

        var g9 = new Game(null, "Cuphead", 2017, "Platform", "XBox, Playstation, PC",
                4.6, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/9.png", "Lorem " +
                "ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non " +
                "quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. " +
                "Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");


        var g10 = new Game(null, "Sonic CD", 1993, "Platform", "Sega CD, PC",
                4.0, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/10.png", "Lorem" +
                " " +
                "ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non " +
                "quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. " +
                "Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");


        gameRepository.saveAll(Arrays.asList(g1,g2,g3,g4,g5,g6,g7,g8,g9,g10));


        var b1 = new Belonging(g1,l1,0);
        var b2 = new Belonging(g2,l1,1);
        var b3 = new Belonging(g3,l1,2);
        var b4 = new Belonging(g4,l1,3);
        var b5 = new Belonging(g5,l1,4);
        var b6 = new Belonging(g6,l2,0);
        var b7 = new Belonging(g7,l2,1);
        var b8 = new Belonging(g8,l2,2);
        var b9 = new Belonging(g9,l2,3);
        var b10 = new Belonging(g10,l2,4);

        belongingRepository.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10));








    }
}
