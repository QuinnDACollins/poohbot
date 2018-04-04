package com.poohs.poohbot;

import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;

public class Pooh {
    public static final String TOKEN = "MzU2OTc4MTIzNTAzNDM1ODE4.DJjNTw.7KFizgW6-sB-tQVVwdb3QcyBYuU";

    public static IDiscordClient client;

    public static void main(String[] args) {
        ClientBuilder builder = new ClientBuilder().withToken(TOKEN);
        client = builder.build();
        client.getDispatcher().registerListener(new EventHandler());
        client.login();
    }
}

