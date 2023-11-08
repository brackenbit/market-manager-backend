/*
 * Market Manager
 * (C) Brackenbit 2023
 * 
 * Extracts the value associated with a given target key within JWT.
 * Only returns a single string value, this is all that's required for now.
 */

package com.brackenbit.marketmanager.utils;

import java.util.Base64;

public class ExtractJWT {

    public static String payloadExtraction(String token, String target) {
        // Remove unnecessary label from start
        token.replace("Bearer ", "");
        // Split into header, payload, and signature (at ".")
        String[] chunks = token.split("\\.");
        // Decode payload from base64
        Base64.Decoder decoder = Base64.getUrlDecoder();
        String payload = new String(decoder.decode(chunks[1]));
        String[] entries = payload.split(",");

        // Try and find target and return associated value
        for (String entry : entries) {
            String[] keyValue = entry.split(":");
            if (keyValue[0].equals(target)) {
                // Remove quotation mark, and "}" if it occurs
                if (keyValue[1].endsWith("}")) {
                    keyValue[1] = keyValue[1].substring(1, keyValue[1].length() - 2);
                } else {
                    keyValue[1] = keyValue[1].substring(1, keyValue[1].length() - 1);
                }

                return keyValue[1];
            }
        }

        // Target not found, return null
        return null;
    }
}
