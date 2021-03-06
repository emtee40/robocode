/**
 * Copyright (c) 2001-2018 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/epl-v10.html
 */
// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package robocode.control.snapshot;

@net.sf.jni4net.attributes.ClrTypeInfo
public final class IScoreSnapshot_ {
    
    //<generated-static>
    private static system.Type staticType;
    
    public static system.Type typeof() {
        return robocode.control.snapshot.IScoreSnapshot_.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        robocode.control.snapshot.IScoreSnapshot_.staticType = staticType;
    }
    //</generated-static>
}

//<generated-proxy>
@net.sf.jni4net.attributes.ClrProxy
class __IScoreSnapshot extends system.Object implements robocode.control.snapshot.IScoreSnapshot {
    
    protected __IScoreSnapshot(net.sf.jni4net.inj.INJEnv __env, long __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/Object;)I")
    public native int compareTo(java.lang.Object par0);
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getName();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getTotalScore();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getTotalSurvivalScore();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getTotalLastSurvivorBonus();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getTotalBulletDamageScore();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getTotalBulletKillBonus();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getTotalRammingDamageScore();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getTotalRammingKillBonus();
    
    @net.sf.jni4net.attributes.ClrMethod("()I")
    public native int getTotalFirsts();
    
    @net.sf.jni4net.attributes.ClrMethod("()I")
    public native int getTotalSeconds();
    
    @net.sf.jni4net.attributes.ClrMethod("()I")
    public native int getTotalThirds();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getCurrentScore();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getCurrentSurvivalScore();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getCurrentSurvivalBonus();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getCurrentBulletDamageScore();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getCurrentBulletKillBonus();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getCurrentRammingDamageScore();
    
    @net.sf.jni4net.attributes.ClrMethod("()D")
    public native double getCurrentRammingKillBonus();
}
//</generated-proxy>
