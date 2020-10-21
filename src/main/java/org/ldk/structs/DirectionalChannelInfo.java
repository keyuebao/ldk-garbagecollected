package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class DirectionalChannelInfo extends CommonBase {
	DirectionalChannelInfo(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		bindings.DirectionalChannelInfo_free(ptr);
	}

	public int get_last_update() {
		int ret = bindings.DirectionalChannelInfo_get_last_update(this.ptr);
		return ret;
	}

	public void set_last_update(int val) {
		bindings.DirectionalChannelInfo_set_last_update(this.ptr, val);
	}

	public boolean get_enabled() {
		boolean ret = bindings.DirectionalChannelInfo_get_enabled(this.ptr);
		return ret;
	}

	public void set_enabled(boolean val) {
		bindings.DirectionalChannelInfo_set_enabled(this.ptr, val);
	}

	public short get_cltv_expiry_delta() {
		short ret = bindings.DirectionalChannelInfo_get_cltv_expiry_delta(this.ptr);
		return ret;
	}

	public void set_cltv_expiry_delta(short val) {
		bindings.DirectionalChannelInfo_set_cltv_expiry_delta(this.ptr, val);
	}

	public long get_htlc_minimum_msat() {
		long ret = bindings.DirectionalChannelInfo_get_htlc_minimum_msat(this.ptr);
		return ret;
	}

	public void set_htlc_minimum_msat(long val) {
		bindings.DirectionalChannelInfo_set_htlc_minimum_msat(this.ptr, val);
	}

	public ChannelUpdate get_last_update_message() {
		long ret = bindings.DirectionalChannelInfo_get_last_update_message(this.ptr);
		ChannelUpdate ret_hu_conv = new ChannelUpdate(null, ret);
		return ret_hu_conv;
	}

	public void set_last_update_message(ChannelUpdate val) {
		bindings.DirectionalChannelInfo_set_last_update_message(this.ptr, val == null ? 0 : val.ptr & ~1);
		this.ptrs_to.add(val);
	}

	public byte[] write(DirectionalChannelInfo obj) {
		byte[] ret = bindings.DirectionalChannelInfo_write(obj == null ? 0 : obj.ptr & ~1);
		this.ptrs_to.add(obj);
		return ret;
	}

	public static DirectionalChannelInfo constructor_read(byte[] ser) {
		long ret = bindings.DirectionalChannelInfo_read(ser);
		DirectionalChannelInfo ret_hu_conv = new DirectionalChannelInfo(null, ret);
		return ret_hu_conv;
	}

}