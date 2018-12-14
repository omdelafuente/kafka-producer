package com.oscarmartin.kafkaproducer.config;

import com.oscarmartin.kafkaproducer.stream.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}
