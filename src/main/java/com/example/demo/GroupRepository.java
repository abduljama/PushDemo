package com.example.demo;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

import java.util.List;

public class GroupRepository {
    private static final String URI_BOOK = " https://ics4-2018.now.sh/";

    public Group createGroup(Group groups) throws Exception {
        GroupFeign groupFeign = Feign.builder().encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder()).target(GroupFeign.class, URI_BOOK);
        Group groups1 = groupFeign.createGroup(groups);
        return groups1;

    }
}
