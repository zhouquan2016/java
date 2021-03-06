package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;

public interface V2beta1ContainerResourceMetricStatusFluent<A extends io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getContainer();
    public A withContainer(java.lang.String container);
    public java.lang.Boolean hasContainer();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withContainer instead.
     */
        public A withNewContainer(java.lang.String original);
    public java.lang.Integer getCurrentAverageUtilization();
    public A withCurrentAverageUtilization(java.lang.Integer currentAverageUtilization);
    public java.lang.Boolean hasCurrentAverageUtilization();
    public io.kubernetes.client.custom.Quantity getCurrentAverageValue();
    public A withCurrentAverageValue(io.kubernetes.client.custom.Quantity currentAverageValue);
    public java.lang.Boolean hasCurrentAverageValue();
    public A withNewCurrentAverageValue(java.lang.String value);
    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
}
