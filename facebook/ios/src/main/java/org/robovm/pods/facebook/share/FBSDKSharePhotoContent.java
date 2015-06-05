/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.facebook.share;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKSharePhotoContent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKSharingContent/*</implements>*/ {

    /*<ptr>*/public static class FBSDKSharePhotoContentPtr extends Ptr<FBSDKSharePhotoContent, FBSDKSharePhotoContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKSharePhotoContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKSharePhotoContent() {}
    protected FBSDKSharePhotoContent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "photos")
    public native NSArray<FBSDKSharePhoto> getPhotos();
    @Property(selector = "setPhotos:")
    public native void setPhotos(NSArray<FBSDKSharePhoto> v);
    @Property(selector = "contentURL")
    public native NSURL getContentURL();
    @Property(selector = "setContentURL:")
    public native void setContentURL(NSURL v);
    @Property(selector = "peopleIDs")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getPeopleIDs();
    @Property(selector = "setPeopleIDs:")
    public native void setPeopleIDs(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class)List<String> v);
    @Property(selector = "placeID")
    public native String getPlaceID();
    @Property(selector = "setPlaceID:")
    public native void setPlaceID(String v);
    @Property(selector = "ref")
    public native String getRef();
    @Property(selector = "setRef:")
    public native void setRef(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqualToSharePhotoContent:")
    public native boolean equalsTo(FBSDKSharePhotoContent content);
    @Method(selector = "copy")
    public native NSObject copy();
    /*</methods>*/
}
