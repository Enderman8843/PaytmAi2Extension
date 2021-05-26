package io.sashi.paytm;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

@DesignerComponent(
        version = 1,
          description = "Paytm Extension Created By Sashibhusan_Coder",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "https://i.ibb.co/82gW8sR/Icon.png")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class Paytm extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public Paytm(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }



    @SimpleFunction(description = "Creates Payment")
    public void IntiatePayment(String DomainUrl, int OrderId , int CustomerId ,int Amount) {
       URLGenerated(DomainUrl + "?" + "OID" + "=" + OrderId + "&" + "CID" + "=" + CustomerId +"&" + "AMT" + "=" +  Amount);
    }
  
    @SimpleEvent(description = "Generated URL")
    public void URLGenerated(String URL) {
      EventDispatcher.dispatchEvent(this, "URLGenerated", URL);
    }
}
