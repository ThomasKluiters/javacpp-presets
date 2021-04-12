// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class WarningHandler extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public WarningHandler() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WarningHandler(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WarningHandler(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public WarningHandler position(long position) {
        return (WarningHandler)super.position(position);
    }
    @Override public WarningHandler getPointer(long i) {
        return new WarningHandler((Pointer)this).position(position + i);
    }

  /** The default warning handler. Prints the message to stderr. */
  public native void process(
        @Const @ByRef SourceLocation source_location,
        @StdString BytePointer msg,
        @Cast("const bool") boolean verbatim);
  public native void process(
        @Const @ByRef SourceLocation source_location,
        @StdString String msg,
        @Cast("const bool") boolean verbatim);
}