package com.poohs.poohbot;

import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.api.internal.DiscordUtils;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.handle.impl.events.shard.LoginEvent;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.handle.obj.IUser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import sx.blah.discord.util.MessageTokenizer;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import static jdk.nashorn.internal.objects.Global.println;

public class EventHandler {
    @EventSubscriber
    public void onLogin(LoginEvent event) {
        System.out.println(event.getClient().getApplicationClientID());
    }


    @EventSubscriber
    public void onMessage(MessageReceivedEvent event) throws IOException, InterruptedException {
        IMessage message = event.getMessage();
        IChannel channel = message.getChannel();
        IGuild guild = event.getGuild();
        IUser user = event.getAuthor();
        String[] args = message.getContent().split(" ");
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Green\\IdeaProjects\\poohbot\\data\\eths"));
        String eths;

        List<String> ethnics = new ArrayList<String>();

        // IUser target = (IUser) new MessageTokenizer(message);
        if (message.getContent().equalsIgnoreCase(">pooh")) {
            channel.sendMessage("my shit 3 inches off the ground");


        }

        if (message.getContent().equalsIgnoreCase(">pooh choosename")) {
            while ((eths = in.readLine()) != null) {
                ethnics.add(eths);
            }
            String[] ethArr = ethnics.toArray(new String[0]);
            println(ethArr);
        }
    }
}




