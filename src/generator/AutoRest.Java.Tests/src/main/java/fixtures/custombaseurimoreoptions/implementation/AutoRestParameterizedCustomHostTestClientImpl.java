/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.custombaseurimoreoptions.implementation;

import fixtures.custombaseurimoreoptions.AutoRestParameterizedCustomHostTestClient;
import fixtures.custombaseurimoreoptions.Paths;
import com.microsoft.rest.ServiceClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the AutoRestParameterizedCustomHostTestClient class.
 */
public final class AutoRestParameterizedCustomHostTestClientImpl extends ServiceClient implements AutoRestParameterizedCustomHostTestClient {

    /** The subscription id with value 'test12'. */
    private String subscriptionId;

    /**
     * Gets The subscription id with value 'test12'.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription id with value 'test12'.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public AutoRestParameterizedCustomHostTestClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** A string value that is used as a global part of the parameterized host. Default value 'host'. */
    private String dnsSuffix;

    /**
     * Gets A string value that is used as a global part of the parameterized host. Default value 'host'.
     *
     * @return the dnsSuffix value.
     */
    public String dnsSuffix() {
        return this.dnsSuffix;
    }

    /**
     * Sets A string value that is used as a global part of the parameterized host. Default value 'host'.
     *
     * @param dnsSuffix the dnsSuffix value.
     * @return the service client itself
     */
    public AutoRestParameterizedCustomHostTestClientImpl withDnsSuffix(String dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
        return this;
    }

    /**
     * The Paths object to access its operations.
     */
    private Paths paths;

    /**
     * Gets the Paths object to access its operations.
     * @return the Paths object.
     */
    public Paths paths() {
        return this.paths;
    }

    /**
     * Initializes an instance of AutoRestParameterizedCustomHostTestClient client.
     */
    public AutoRestParameterizedCustomHostTestClientImpl() {
        this("https://{vault}{secret}{dnsSuffix}");
    }

    /**
     * Initializes an instance of AutoRestParameterizedCustomHostTestClient client.
     *
     * @param baseUrl the base URL of the host
     */
    private AutoRestParameterizedCustomHostTestClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestParameterizedCustomHostTestClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public AutoRestParameterizedCustomHostTestClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://{vault}{secret}{dnsSuffix}", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestParameterizedCustomHostTestClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    private AutoRestParameterizedCustomHostTestClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    private void initialize() {
        this.dnsSuffix = "host";
        this.paths = new PathsImpl(retrofit(), this);
    }
}
