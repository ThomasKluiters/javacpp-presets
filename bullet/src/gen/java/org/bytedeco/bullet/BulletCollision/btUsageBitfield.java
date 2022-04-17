// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;

// #endif  //BT_USE_DOUBLE_PRECISION

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btUsageBitfield extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btUsageBitfield(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btUsageBitfield(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btUsageBitfield position(long position) {
        return (btUsageBitfield)super.position(position);
    }
    @Override public btUsageBitfield getPointer(long i) {
        return new btUsageBitfield((Pointer)this).offsetAddress(i);
    }

	public btUsageBitfield() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native void reset();
	public native @Cast("unsigned short") @NoOffset short usedVertexA(); public native btUsageBitfield usedVertexA(short setter);
	public native @Cast("unsigned short") @NoOffset short usedVertexB(); public native btUsageBitfield usedVertexB(short setter);
	public native @Cast("unsigned short") @NoOffset short usedVertexC(); public native btUsageBitfield usedVertexC(short setter);
	public native @Cast("unsigned short") @NoOffset short usedVertexD(); public native btUsageBitfield usedVertexD(short setter);
	public native @Cast("unsigned short") @NoOffset short unused1(); public native btUsageBitfield unused1(short setter);
	public native @Cast("unsigned short") @NoOffset short unused2(); public native btUsageBitfield unused2(short setter);
	public native @Cast("unsigned short") @NoOffset short unused3(); public native btUsageBitfield unused3(short setter);
	public native @Cast("unsigned short") @NoOffset short unused4(); public native btUsageBitfield unused4(short setter);
}