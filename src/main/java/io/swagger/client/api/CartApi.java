

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.Address;
import io.swagger.client.model.AvailableCountries;
import io.swagger.client.model.AvailablePaymentMethodList;
import io.swagger.client.model.AvailableShippingMethodList;
import io.swagger.client.model.Cart;
import io.swagger.client.model.Checkout;
import io.swagger.client.model.CustomerAttributes;
import io.swagger.client.model.PaymentMethod;
import io.swagger.client.model.Product;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartApi {
    private ApiClient apiClient;

    public CartApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CartApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for checkoutAvailableCountriesGetUsingGET */
    private com.squareup.okhttp.Call checkoutAvailableCountriesGetUsingGETCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/checkout/availableCountries".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get available billing and shipping countries
     * 
     * @return AvailableCountries
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AvailableCountries checkoutAvailableCountriesGetUsingGET() throws ApiException {
        ApiResponse<AvailableCountries> resp = checkoutAvailableCountriesGetUsingGETWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get available billing and shipping countries
     * 
     * @return ApiResponse&lt;AvailableCountries&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AvailableCountries> checkoutAvailableCountriesGetUsingGETWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = checkoutAvailableCountriesGetUsingGETCall(null, null);
        Type localVarReturnType = new TypeToken<AvailableCountries>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get available billing and shipping countries (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkoutAvailableCountriesGetUsingGETAsync(final ApiCallback<AvailableCountries> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = checkoutAvailableCountriesGetUsingGETCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AvailableCountries>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET */
    private com.squareup.okhttp.Call checkoutCheckoutIdAvailablePaymentMethodsGetUsingGETCall(String checkoutId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'checkoutId' is set
        if (checkoutId == null) {
            throw new ApiException("Missing the required parameter 'checkoutId' when calling checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/checkout/{checkoutId}/availablePaymentMethods".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "checkoutId" + "\\}", apiClient.escapeString(checkoutId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get available payment methods
     * 
     * @param checkoutId Checkout Id (required)
     * @return AvailablePaymentMethodList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AvailablePaymentMethodList checkoutCheckoutIdAvailablePaymentMethodsGetUsingGET(String checkoutId) throws ApiException {
        ApiResponse<AvailablePaymentMethodList> resp = checkoutCheckoutIdAvailablePaymentMethodsGetUsingGETWithHttpInfo(checkoutId);
        return resp.getData();
    }

    /**
     * Get available payment methods
     * 
     * @param checkoutId Checkout Id (required)
     * @return ApiResponse&lt;AvailablePaymentMethodList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AvailablePaymentMethodList> checkoutCheckoutIdAvailablePaymentMethodsGetUsingGETWithHttpInfo(String checkoutId) throws ApiException {
        com.squareup.okhttp.Call call = checkoutCheckoutIdAvailablePaymentMethodsGetUsingGETCall(checkoutId, null, null);
        Type localVarReturnType = new TypeToken<AvailablePaymentMethodList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get available payment methods (asynchronously)
     * 
     * @param checkoutId Checkout Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkoutCheckoutIdAvailablePaymentMethodsGetUsingGETAsync(String checkoutId, final ApiCallback<AvailablePaymentMethodList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = checkoutCheckoutIdAvailablePaymentMethodsGetUsingGETCall(checkoutId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AvailablePaymentMethodList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for checkoutCheckoutIdAvailableShippingMethodsGetUsingGET */
    private com.squareup.okhttp.Call checkoutCheckoutIdAvailableShippingMethodsGetUsingGETCall(String checkoutId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'checkoutId' is set
        if (checkoutId == null) {
            throw new ApiException("Missing the required parameter 'checkoutId' when calling checkoutCheckoutIdAvailableShippingMethodsGetUsingGET(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/checkout/{checkoutId}/availableShippingMethods".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "checkoutId" + "\\}", apiClient.escapeString(checkoutId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get shipping info
     * 
     * @param checkoutId Checkout Id (required)
     * @return AvailableShippingMethodList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AvailableShippingMethodList checkoutCheckoutIdAvailableShippingMethodsGetUsingGET(String checkoutId) throws ApiException {
        ApiResponse<AvailableShippingMethodList> resp = checkoutCheckoutIdAvailableShippingMethodsGetUsingGETWithHttpInfo(checkoutId);
        return resp.getData();
    }

    /**
     * Get shipping info
     * 
     * @param checkoutId Checkout Id (required)
     * @return ApiResponse&lt;AvailableShippingMethodList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AvailableShippingMethodList> checkoutCheckoutIdAvailableShippingMethodsGetUsingGETWithHttpInfo(String checkoutId) throws ApiException {
        com.squareup.okhttp.Call call = checkoutCheckoutIdAvailableShippingMethodsGetUsingGETCall(checkoutId, null, null);
        Type localVarReturnType = new TypeToken<AvailableShippingMethodList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get shipping info (asynchronously)
     * 
     * @param checkoutId Checkout Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkoutCheckoutIdAvailableShippingMethodsGetUsingGETAsync(String checkoutId, final ApiCallback<AvailableShippingMethodList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = checkoutCheckoutIdAvailableShippingMethodsGetUsingGETCall(checkoutId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AvailableShippingMethodList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for checkoutCheckoutIdBillingAddressPutUsingPUT */
    private com.squareup.okhttp.Call checkoutCheckoutIdBillingAddressPutUsingPUTCall(String checkoutId, Address body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'checkoutId' is set
        if (checkoutId == null) {
            throw new ApiException("Missing the required parameter 'checkoutId' when calling checkoutCheckoutIdBillingAddressPutUsingPUT(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling checkoutCheckoutIdBillingAddressPutUsingPUT(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/checkout/{checkoutId}/billingAddress".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "checkoutId" + "\\}", apiClient.escapeString(checkoutId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Update the billing address
     * 
     * @param checkoutId Checkout Id (required)
     * @param body Cart object that needs to be updated (required)
     * @return Checkout
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Checkout checkoutCheckoutIdBillingAddressPutUsingPUT(String checkoutId, Address body) throws ApiException {
        ApiResponse<Checkout> resp = checkoutCheckoutIdBillingAddressPutUsingPUTWithHttpInfo(checkoutId, body);
        return resp.getData();
    }

    /**
     * Update the billing address
     * 
     * @param checkoutId Checkout Id (required)
     * @param body Cart object that needs to be updated (required)
     * @return ApiResponse&lt;Checkout&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Checkout> checkoutCheckoutIdBillingAddressPutUsingPUTWithHttpInfo(String checkoutId, Address body) throws ApiException {
        com.squareup.okhttp.Call call = checkoutCheckoutIdBillingAddressPutUsingPUTCall(checkoutId, body, null, null);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update the billing address (asynchronously)
     * 
     * @param checkoutId Checkout Id (required)
     * @param body Cart object that needs to be updated (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkoutCheckoutIdBillingAddressPutUsingPUTAsync(String checkoutId, Address body, final ApiCallback<Checkout> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = checkoutCheckoutIdBillingAddressPutUsingPUTCall(checkoutId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for checkoutCheckoutIdCustomerAttributesPutUsingPUT */
    private com.squareup.okhttp.Call checkoutCheckoutIdCustomerAttributesPutUsingPUTCall(String checkoutId, CustomerAttributes customerAttributes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = customerAttributes;
        
        // verify the required parameter 'checkoutId' is set
        if (checkoutId == null) {
            throw new ApiException("Missing the required parameter 'checkoutId' when calling checkoutCheckoutIdCustomerAttributesPutUsingPUT(Async)");
        }
        
        // verify the required parameter 'customerAttributes' is set
        if (customerAttributes == null) {
            throw new ApiException("Missing the required parameter 'customerAttributes' when calling checkoutCheckoutIdCustomerAttributesPutUsingPUT(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/checkout/{checkoutId}/customerAttributes".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "checkoutId" + "\\}", apiClient.escapeString(checkoutId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Set or update customer attributes
     * 
     * @param checkoutId Checkout Id (required)
     * @param customerAttributes Customer attributes (required)
     * @return Checkout
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Checkout checkoutCheckoutIdCustomerAttributesPutUsingPUT(String checkoutId, CustomerAttributes customerAttributes) throws ApiException {
        ApiResponse<Checkout> resp = checkoutCheckoutIdCustomerAttributesPutUsingPUTWithHttpInfo(checkoutId, customerAttributes);
        return resp.getData();
    }

    /**
     * Set or update customer attributes
     * 
     * @param checkoutId Checkout Id (required)
     * @param customerAttributes Customer attributes (required)
     * @return ApiResponse&lt;Checkout&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Checkout> checkoutCheckoutIdCustomerAttributesPutUsingPUTWithHttpInfo(String checkoutId, CustomerAttributes customerAttributes) throws ApiException {
        com.squareup.okhttp.Call call = checkoutCheckoutIdCustomerAttributesPutUsingPUTCall(checkoutId, customerAttributes, null, null);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Set or update customer attributes (asynchronously)
     * 
     * @param checkoutId Checkout Id (required)
     * @param customerAttributes Customer attributes (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkoutCheckoutIdCustomerAttributesPutUsingPUTAsync(String checkoutId, CustomerAttributes customerAttributes, final ApiCallback<Checkout> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = checkoutCheckoutIdCustomerAttributesPutUsingPUTCall(checkoutId, customerAttributes, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for checkoutCheckoutIdGetUsingGET */
    private com.squareup.okhttp.Call checkoutCheckoutIdGetUsingGETCall(String checkoutId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'checkoutId' is set
        if (checkoutId == null) {
            throw new ApiException("Missing the required parameter 'checkoutId' when calling checkoutCheckoutIdGetUsingGET(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/checkout/{checkoutId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "checkoutId" + "\\}", apiClient.escapeString(checkoutId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get an existing cart
     * 
     * @param checkoutId Checkout Id (required)
     * @return Checkout
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Checkout checkoutCheckoutIdGetUsingGET(String checkoutId) throws ApiException {
        ApiResponse<Checkout> resp = checkoutCheckoutIdGetUsingGETWithHttpInfo(checkoutId);
        return resp.getData();
    }

    /**
     * Get an existing cart
     * 
     * @param checkoutId Checkout Id (required)
     * @return ApiResponse&lt;Checkout&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Checkout> checkoutCheckoutIdGetUsingGETWithHttpInfo(String checkoutId) throws ApiException {
        com.squareup.okhttp.Call call = checkoutCheckoutIdGetUsingGETCall(checkoutId, null, null);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an existing cart (asynchronously)
     * 
     * @param checkoutId Checkout Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkoutCheckoutIdGetUsingGETAsync(String checkoutId, final ApiCallback<Checkout> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = checkoutCheckoutIdGetUsingGETCall(checkoutId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for checkoutCheckoutIdItemsItemIdDeleteUsingDELETE */
    private com.squareup.okhttp.Call checkoutCheckoutIdItemsItemIdDeleteUsingDELETECall(String checkoutId, String itemId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'checkoutId' is set
        if (checkoutId == null) {
            throw new ApiException("Missing the required parameter 'checkoutId' when calling checkoutCheckoutIdItemsItemIdDeleteUsingDELETE(Async)");
        }
        
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling checkoutCheckoutIdItemsItemIdDeleteUsingDELETE(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/checkout/{checkoutId}/items/{itemId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "checkoutId" + "\\}", apiClient.escapeString(checkoutId.toString()))
        .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Delete an item from the shopping cart
     * 
     * @param checkoutId Checkout Id (required)
     * @param itemId Item Id (required)
     * @return Checkout
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Checkout checkoutCheckoutIdItemsItemIdDeleteUsingDELETE(String checkoutId, String itemId) throws ApiException {
        ApiResponse<Checkout> resp = checkoutCheckoutIdItemsItemIdDeleteUsingDELETEWithHttpInfo(checkoutId, itemId);
        return resp.getData();
    }

    /**
     * Delete an item from the shopping cart
     * 
     * @param checkoutId Checkout Id (required)
     * @param itemId Item Id (required)
     * @return ApiResponse&lt;Checkout&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Checkout> checkoutCheckoutIdItemsItemIdDeleteUsingDELETEWithHttpInfo(String checkoutId, String itemId) throws ApiException {
        com.squareup.okhttp.Call call = checkoutCheckoutIdItemsItemIdDeleteUsingDELETECall(checkoutId, itemId, null, null);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete an item from the shopping cart (asynchronously)
     * 
     * @param checkoutId Checkout Id (required)
     * @param itemId Item Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkoutCheckoutIdItemsItemIdDeleteUsingDELETEAsync(String checkoutId, String itemId, final ApiCallback<Checkout> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = checkoutCheckoutIdItemsItemIdDeleteUsingDELETECall(checkoutId, itemId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for checkoutCheckoutIdItemsItemIdPutUsingPUT */
    private com.squareup.okhttp.Call checkoutCheckoutIdItemsItemIdPutUsingPUTCall(String checkoutId, String itemId, Product item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = item;
        
        // verify the required parameter 'checkoutId' is set
        if (checkoutId == null) {
            throw new ApiException("Missing the required parameter 'checkoutId' when calling checkoutCheckoutIdItemsItemIdPutUsingPUT(Async)");
        }
        
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException("Missing the required parameter 'itemId' when calling checkoutCheckoutIdItemsItemIdPutUsingPUT(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling checkoutCheckoutIdItemsItemIdPutUsingPUT(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/checkout/{checkoutId}/items/{itemId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "checkoutId" + "\\}", apiClient.escapeString(checkoutId.toString()))
        .replaceAll("\\{" + "itemId" + "\\}", apiClient.escapeString(itemId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Update an existing item from the shopping cart
     * 
     * @param checkoutId Checkout Id (required)
     * @param itemId Item Id (required)
     * @param item Item (required)
     * @return Checkout
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Checkout checkoutCheckoutIdItemsItemIdPutUsingPUT(String checkoutId, String itemId, Product item) throws ApiException {
        ApiResponse<Checkout> resp = checkoutCheckoutIdItemsItemIdPutUsingPUTWithHttpInfo(checkoutId, itemId, item);
        return resp.getData();
    }

    /**
     * Update an existing item from the shopping cart
     * 
     * @param checkoutId Checkout Id (required)
     * @param itemId Item Id (required)
     * @param item Item (required)
     * @return ApiResponse&lt;Checkout&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Checkout> checkoutCheckoutIdItemsItemIdPutUsingPUTWithHttpInfo(String checkoutId, String itemId, Product item) throws ApiException {
        com.squareup.okhttp.Call call = checkoutCheckoutIdItemsItemIdPutUsingPUTCall(checkoutId, itemId, item, null, null);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an existing item from the shopping cart (asynchronously)
     * 
     * @param checkoutId Checkout Id (required)
     * @param itemId Item Id (required)
     * @param item Item (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkoutCheckoutIdItemsItemIdPutUsingPUTAsync(String checkoutId, String itemId, Product item, final ApiCallback<Checkout> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = checkoutCheckoutIdItemsItemIdPutUsingPUTCall(checkoutId, itemId, item, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for checkoutCheckoutIdPayPostUsingPOST */
    private com.squareup.okhttp.Call checkoutCheckoutIdPayPostUsingPOSTCall(String checkoutId, PaymentMethod body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'checkoutId' is set
        if (checkoutId == null) {
            throw new ApiException("Missing the required parameter 'checkoutId' when calling checkoutCheckoutIdPayPostUsingPOST(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling checkoutCheckoutIdPayPostUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/checkout/{checkoutId}/pay".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "checkoutId" + "\\}", apiClient.escapeString(checkoutId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Pay the cart total
     * 
     * @param checkoutId Checkout Id (required)
     * @param body Payment method (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void checkoutCheckoutIdPayPostUsingPOST(String checkoutId, PaymentMethod body) throws ApiException {
        checkoutCheckoutIdPayPostUsingPOSTWithHttpInfo(checkoutId, body);
    }

    /**
     * Pay the cart total
     * 
     * @param checkoutId Checkout Id (required)
     * @param body Payment method (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> checkoutCheckoutIdPayPostUsingPOSTWithHttpInfo(String checkoutId, PaymentMethod body) throws ApiException {
        com.squareup.okhttp.Call call = checkoutCheckoutIdPayPostUsingPOSTCall(checkoutId, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Pay the cart total (asynchronously)
     * 
     * @param checkoutId Checkout Id (required)
     * @param body Payment method (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkoutCheckoutIdPayPostUsingPOSTAsync(String checkoutId, PaymentMethod body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = checkoutCheckoutIdPayPostUsingPOSTCall(checkoutId, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for checkoutCheckoutIdShippingAddressPutUsingPUT */
    private com.squareup.okhttp.Call checkoutCheckoutIdShippingAddressPutUsingPUTCall(String checkoutId, Address body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'checkoutId' is set
        if (checkoutId == null) {
            throw new ApiException("Missing the required parameter 'checkoutId' when calling checkoutCheckoutIdShippingAddressPutUsingPUT(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling checkoutCheckoutIdShippingAddressPutUsingPUT(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/checkout/{checkoutId}/shippingAddress".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "checkoutId" + "\\}", apiClient.escapeString(checkoutId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Update the shipping address
     * 
     * @param checkoutId Checkout Id (required)
     * @param body Shipping address (required)
     * @return Checkout
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Checkout checkoutCheckoutIdShippingAddressPutUsingPUT(String checkoutId, Address body) throws ApiException {
        ApiResponse<Checkout> resp = checkoutCheckoutIdShippingAddressPutUsingPUTWithHttpInfo(checkoutId, body);
        return resp.getData();
    }

    /**
     * Update the shipping address
     * 
     * @param checkoutId Checkout Id (required)
     * @param body Shipping address (required)
     * @return ApiResponse&lt;Checkout&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Checkout> checkoutCheckoutIdShippingAddressPutUsingPUTWithHttpInfo(String checkoutId, Address body) throws ApiException {
        com.squareup.okhttp.Call call = checkoutCheckoutIdShippingAddressPutUsingPUTCall(checkoutId, body, null, null);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update the shipping address (asynchronously)
     * 
     * @param checkoutId Checkout Id (required)
     * @param body Shipping address (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkoutCheckoutIdShippingAddressPutUsingPUTAsync(String checkoutId, Address body, final ApiCallback<Checkout> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = checkoutCheckoutIdShippingAddressPutUsingPUTCall(checkoutId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for checkoutCheckoutIdShippingMethodPutUsingPUT */
    private com.squareup.okhttp.Call checkoutCheckoutIdShippingMethodPutUsingPUTCall(String checkoutId, String shippingMethod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'checkoutId' is set
        if (checkoutId == null) {
            throw new ApiException("Missing the required parameter 'checkoutId' when calling checkoutCheckoutIdShippingMethodPutUsingPUT(Async)");
        }
        
        // verify the required parameter 'shippingMethod' is set
        if (shippingMethod == null) {
            throw new ApiException("Missing the required parameter 'shippingMethod' when calling checkoutCheckoutIdShippingMethodPutUsingPUT(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/checkout/{checkoutId}/shippingMethod".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "checkoutId" + "\\}", apiClient.escapeString(checkoutId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (shippingMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "shippingMethod", shippingMethod));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Set or update the shipping method
     * 
     * @param checkoutId Checkout Id (required)
     * @param shippingMethod Shipping method (0: Express, 1: Standard, 2: Economy) (required)
     * @return Checkout
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Checkout checkoutCheckoutIdShippingMethodPutUsingPUT(String checkoutId, String shippingMethod) throws ApiException {
        ApiResponse<Checkout> resp = checkoutCheckoutIdShippingMethodPutUsingPUTWithHttpInfo(checkoutId, shippingMethod);
        return resp.getData();
    }

    /**
     * Set or update the shipping method
     * 
     * @param checkoutId Checkout Id (required)
     * @param shippingMethod Shipping method (0: Express, 1: Standard, 2: Economy) (required)
     * @return ApiResponse&lt;Checkout&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Checkout> checkoutCheckoutIdShippingMethodPutUsingPUTWithHttpInfo(String checkoutId, String shippingMethod) throws ApiException {
        com.squareup.okhttp.Call call = checkoutCheckoutIdShippingMethodPutUsingPUTCall(checkoutId, shippingMethod, null, null);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Set or update the shipping method (asynchronously)
     * 
     * @param checkoutId Checkout Id (required)
     * @param shippingMethod Shipping method (0: Express, 1: Standard, 2: Economy) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call checkoutCheckoutIdShippingMethodPutUsingPUTAsync(String checkoutId, String shippingMethod, final ApiCallback<Checkout> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = checkoutCheckoutIdShippingMethodPutUsingPUTCall(checkoutId, shippingMethod, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for createCartUsingPOST */
    private com.squareup.okhttp.Call createCartUsingPOSTCall(Cart cart, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = cart;
        
        // verify the required parameter 'cart' is set
        if (cart == null) {
            throw new ApiException("Missing the required parameter 'cart' when calling createCartUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/checkout".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Create a possibly empty shopping cart
     * 
     * @param cart Includes billing and products info (required)
     * @return Checkout
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Checkout createCartUsingPOST(Cart cart) throws ApiException {
        ApiResponse<Checkout> resp = createCartUsingPOSTWithHttpInfo(cart);
        return resp.getData();
    }

    /**
     * Create a possibly empty shopping cart
     * 
     * @param cart Includes billing and products info (required)
     * @return ApiResponse&lt;Checkout&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Checkout> createCartUsingPOSTWithHttpInfo(Cart cart) throws ApiException {
        com.squareup.okhttp.Call call = createCartUsingPOSTCall(cart, null, null);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a possibly empty shopping cart (asynchronously)
     * 
     * @param cart Includes billing and products info (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCartUsingPOSTAsync(Cart cart, final ApiCallback<Checkout> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createCartUsingPOSTCall(cart, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for createItemUsingPOST */
    private com.squareup.okhttp.Call createItemUsingPOSTCall(String checkoutId, Product item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = item;
        
        // verify the required parameter 'checkoutId' is set
        if (checkoutId == null) {
            throw new ApiException("Missing the required parameter 'checkoutId' when calling createItemUsingPOST(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling createItemUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/checkout/{checkoutId}/items".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "checkoutId" + "\\}", apiClient.escapeString(checkoutId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Add a new item to the shopping cart
     * 
     * @param checkoutId Checkout Id (required)
     * @param item Item to be added to the cart (required)
     * @return Checkout
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Checkout createItemUsingPOST(String checkoutId, Product item) throws ApiException {
        ApiResponse<Checkout> resp = createItemUsingPOSTWithHttpInfo(checkoutId, item);
        return resp.getData();
    }

    /**
     * Add a new item to the shopping cart
     * 
     * @param checkoutId Checkout Id (required)
     * @param item Item to be added to the cart (required)
     * @return ApiResponse&lt;Checkout&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Checkout> createItemUsingPOSTWithHttpInfo(String checkoutId, Product item) throws ApiException {
        com.squareup.okhttp.Call call = createItemUsingPOSTCall(checkoutId, item, null, null);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a new item to the shopping cart (asynchronously)
     * 
     * @param checkoutId Checkout Id (required)
     * @param item Item to be added to the cart (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createItemUsingPOSTAsync(String checkoutId, Product item, final ApiCallback<Checkout> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createItemUsingPOSTCall(checkoutId, item, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Checkout>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
