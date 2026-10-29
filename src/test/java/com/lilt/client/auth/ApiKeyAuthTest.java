package com.lilt.client.auth;

/*-
 * #%L
 * com.lilt.client:lilt-java
 * %%
 * Copyright (C) 2015 - 2026 Lilt
 * %%
 * Lilt Client Library License – Source Supplied, Permissive, Attribution, Noncommercial
 * 
 * THE LILT CLIENT LIBRARY SOFTWARE OR WORK (AS DEFINED BELOW) IS PROVIDED UNDER
 * THE TERMS OF THIS ("LICENSE"). THE WORK IS PROTECTED BY COPYRIGHT AND/OR OTHER
 * APPLICABLE LAW. ANY USE OF THE WORK OTHER THAN AS AUTHORIZED UNDER THIS LICENSE
 * OR COPYRIGHT LAW IS PROHIBITED. BY EXERCISING ANY RIGHTS TO THE WORK PROVIDED
 * HERE, YOU ACCEPT AND AGREE TO BE BOUND BY THE TERMS OF THIS LICENSE. TO THE
 * EXTENT THIS LICENSE MAY BE CONSIDERED TO BE A CONTRACT, THE LICENSOR GRANTS YOU
 * THE RIGHTS CONTAINED HERE IN CONSIDERATION OF YOUR ACCEPTANCE OF SUCH TERMS AND
 * CONDITIONS.
 * #L%
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.lilt.client.ApiClient;
import com.lilt.client.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Credentials;
import org.junit.Test;

/** The API key set as ApiKeyAuth is sent as HTTP Basic auth, never in the URL. */
public class ApiKeyAuthTest {

  @Test
  public void apiKeyIsSentAsBasicAuthorizationHeader() {
    ApiClient client = new ApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) client.getAuthentication("ApiKeyAuth");
    auth.setApiKey("secret");

    List<Pair> queryParams = new ArrayList<>();
    Map<String, String> headerParams = new HashMap<>();
    auth.applyToParams(queryParams, headerParams, new HashMap<>());

    assertTrue(queryParams.isEmpty());
    assertEquals(Credentials.basic("secret", "secret"), headerParams.get("Authorization"));
  }

  @Test
  public void apiKeyMatchesBasicAuthWithTheKeyTwice() {
    ApiClient client = new ApiClient();
    ((ApiKeyAuth) client.getAuthentication("ApiKeyAuth")).setApiKey("secret");
    HttpBasicAuth basic = (HttpBasicAuth) client.getAuthentication("BasicAuth");
    basic.setUsername("secret");
    basic.setPassword("secret");

    Map<String, String> fromApiKey = new HashMap<>();
    Map<String, String> fromBasic = new HashMap<>();
    client.getAuthentication("ApiKeyAuth").applyToParams(new ArrayList<>(), fromApiKey, new HashMap<>());
    basic.applyToParams(new ArrayList<>(), fromBasic, new HashMap<>());

    assertEquals(fromBasic, fromApiKey);
  }

  @Test
  public void unsetApiKeyAddsNothing() {
    ApiClient client = new ApiClient();
    List<Pair> queryParams = new ArrayList<>();
    Map<String, String> headerParams = new HashMap<>();

    client.getAuthentication("ApiKeyAuth").applyToParams(queryParams, headerParams, new HashMap<>());

    assertTrue(queryParams.isEmpty());
    assertTrue(headerParams.isEmpty());
  }
}
