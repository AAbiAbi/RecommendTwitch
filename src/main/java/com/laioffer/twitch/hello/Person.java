package com.laioffer.twitch.hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Person(String name,
                     String company,
                     @JsonProperty("home_address") Address homeAddress,
                     //change to snack cqse
                     @JsonProperty("favorite_book")Book favoriteBook
) {
}
