package com.thousandeyes.sdk;

import java.util.List;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.NativeApiClient;
import com.thousandeyes.sdk.endpoint.agents.ManageAgentsApi;
import com.thousandeyes.sdk.endpoint.agents.model.EndpointAgent;
import com.thousandeyes.sdk.endpoint.agents.model.ListEndpointAgentsResponse;
import com.thousandeyes.sdk.pagination.Paginator;



class PaginatorExample {
    private static final ApiClient apiClient = NativeApiClient
            .builder()
            .baseUri("https://api.stg.thousandeyes.com/v7")
            .bearerToken("<token>")
            .build();

    public static void main(String[] args) {
        var apiInstance = new ManageAgentsApi(apiClient);
        var aid = "11";
        var max = 1;

        Paginator<EndpointAgent, ListEndpointAgentsResponse> paginator = new Paginator<>(
                cursor -> {
                    try {
                        return apiInstance.getEndpointAgents(max, cursor, aid, List.of(), false,
                                                             false, null, "CSCO-W-PW02XZDB");
                    }
                    catch (ApiException e) {
                        throw new RuntimeException(e);
                    }
                },
                ListEndpointAgentsResponse::getAgents
        );

        try {
            List<EndpointAgent> allAgents = paginator.getAll();
            allAgents.forEach(System.out::println);
        }
        catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
