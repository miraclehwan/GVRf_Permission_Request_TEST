package com.example.daehwankim.test_permission;

import org.gearvrf.GVRAndroidResource;
import org.gearvrf.GVRContext;
import org.gearvrf.GVRMain;
import org.gearvrf.GVRScene;
import org.gearvrf.GVRTexture;
import org.gearvrf.scene_objects.GVRSphereSceneObject;

import java.util.concurrent.Future;

/**
 * Created by daehwan.kim on 2017-06-02.
 */

public class Main extends GVRMain {

    GVRContext mGVRContext;

    public Main(GVRContext gvrContext){
        mGVRContext = gvrContext;
    }

    @Override
    public void onInit(GVRContext gvrContext) throws Throwable {
        super.onInit(gvrContext);

        GVRScene scene = gvrContext.getMainScene();

        GVRSphereSceneObject basic_sphereObject;

        Future<GVRTexture> texture = gvrContext.getAssetLoader().loadFutureTexture(new GVRAndroidResource(gvrContext, R.drawable.ic_launcher_web));;


        // create a sphere scene object with the specified texture and triangles facing inward (the 'false' argument)
        basic_sphereObject = new GVRSphereSceneObject(gvrContext, 72, 144, false, texture);
        basic_sphereObject.getTransform().setScale(100f, 100f, 100f);
        // add the scene object to the scene graph
        scene.addSceneObject(basic_sphereObject);


    }
}
