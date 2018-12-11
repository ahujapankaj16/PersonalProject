
package ai.kitt.snowboy;

public class snowboyJNI {
    public final static native long new_SnowboyDetect(String jarg1, String jarg2);

    public final static native boolean SnowboyDetect_Reset(long jarg1, SnowboyDetect jarg1_);

    public final static native int SnowboyDetect_RunDetection__SWIG_0(long jarg1, SnowboyDetect jarg1_, String jarg2, boolean jarg3);

    public final static native int SnowboyDetect_RunDetection__SWIG_1(long jarg1, SnowboyDetect jarg1_, String jarg2);

    public final static native int SnowboyDetect_RunDetection__SWIG_2(long jarg1, SnowboyDetect jarg1_, float[] jarg2, int jarg3, boolean jarg4);

    public final static native int SnowboyDetect_RunDetection__SWIG_3(long jarg1, SnowboyDetect jarg1_, float[] jarg2, int jarg3);

    public final static native int SnowboyDetect_RunDetection__SWIG_4(long jarg1, SnowboyDetect jarg1_, short[] jarg2, int jarg3, boolean jarg4);

    public final static native int SnowboyDetect_RunDetection__SWIG_5(long jarg1, SnowboyDetect jarg1_, short[] jarg2, int jarg3);

    public final static native int SnowboyDetect_RunDetection__SWIG_6(long jarg1, SnowboyDetect jarg1_, int[] jarg2, int jarg3, boolean jarg4);

    public final static native int SnowboyDetect_RunDetection__SWIG_7(long jarg1, SnowboyDetect jarg1_, int[] jarg2, int jarg3);

    public final static native void SnowboyDetect_SetSensitivity(long jarg1, SnowboyDetect jarg1_, String jarg2);

    public final static native String SnowboyDetect_GetSensitivity(long jarg1, SnowboyDetect jarg1_);

    public final static native void SnowboyDetect_SetAudioGain(long jarg1, SnowboyDetect jarg1_, float jarg2);

    public final static native void SnowboyDetect_UpdateModel(long jarg1, SnowboyDetect jarg1_);

    public final static native int SnowboyDetect_NumHotwords(long jarg1, SnowboyDetect jarg1_);

    public final static native void SnowboyDetect_ApplyFrontend(long jarg1, SnowboyDetect jarg1_, boolean jarg2);

    public final static native int SnowboyDetect_SampleRate(long jarg1, SnowboyDetect jarg1_);

    public final static native int SnowboyDetect_NumChannels(long jarg1, SnowboyDetect jarg1_);

    public final static native int SnowboyDetect_BitsPerSample(long jarg1, SnowboyDetect jarg1_);

    public final static native void delete_SnowboyDetect(long jarg1);
}