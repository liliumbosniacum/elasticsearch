package com.lilium.elasticsearch.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.nio.file.Files;

public class Util {
    private static final Logger LOG = LoggerFactory.getLogger(Util.class);

    public static String loadAsString(final String path) {
        try {
            final File resource = new ClassPathResource(path).getFile();

            return new String(Files.readAllBytes(resource.toPath()));
        } catch (final Exception e) {
            LOG.error(e.getMessage(), e);
            return null;
        }
    }
}
