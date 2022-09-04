package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;
import java.lang.ref.Reference;
import javax.annotation.Nullable;


/**
 * A Tuple
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class TwoTuple_SignatureSignatureZ extends CommonBase {
	TwoTuple_SignatureSignatureZ(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.C2Tuple_SignatureSignatureZ_free(ptr); }
	}

	/**
	 * 
	 */
	public byte[] get_a() {
		byte[] ret = bindings.C2Tuple_SignatureSignatureZ_get_a(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * 
	 */
	public byte[] get_b() {
		byte[] ret = bindings.C2Tuple_SignatureSignatureZ_get_b(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	long clone_ptr() {
		long ret = bindings.C2Tuple_SignatureSignatureZ_clone_ptr(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * Creates a new tuple which has the same data as `orig`
	 * but with all dynamically-allocated buffers duplicated in new buffers.
	 */
	public TwoTuple_SignatureSignatureZ clone() {
		long ret = bindings.C2Tuple_SignatureSignatureZ_clone(this.ptr);
		Reference.reachabilityFence(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		TwoTuple_SignatureSignatureZ ret_hu_conv = new TwoTuple_SignatureSignatureZ(null, ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(this); };
		return ret_hu_conv;
	}

	/**
	 * Creates a new C2Tuple_SignatureSignatureZ from the contained elements.
	 */
	public static TwoTuple_SignatureSignatureZ of(byte[] a, byte[] b) {
		long ret = bindings.C2Tuple_SignatureSignatureZ_new(InternalUtils.check_arr_len(a, 64), InternalUtils.check_arr_len(b, 64));
		Reference.reachabilityFence(a);
		Reference.reachabilityFence(b);
		if (ret >= 0 && ret <= 4096) { return null; }
		TwoTuple_SignatureSignatureZ ret_hu_conv = new TwoTuple_SignatureSignatureZ(null, ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		return ret_hu_conv;
	}

}
