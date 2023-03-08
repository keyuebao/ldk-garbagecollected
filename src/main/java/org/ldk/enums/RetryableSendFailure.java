package org.ldk.enums;

/**
 * Indicates an immediate error on [`ChannelManager::send_payment_with_retry`]. Further errors
 * may be surfaced later via [`Event::PaymentPathFailed`] and [`Event::PaymentFailed`].
 * 
 * [`ChannelManager::send_payment_with_retry`]: crate::ln::channelmanager::ChannelManager::send_payment_with_retry
 * [`Event::PaymentPathFailed`]: crate::util::events::Event::PaymentPathFailed
 * [`Event::PaymentFailed`]: crate::util::events::Event::PaymentFailed
 */
public enum RetryableSendFailure {
	/**
	 * The provided [`PaymentParameters::expiry_time`] indicated that the payment has expired. Note
	 * that this error is *not* caused by [`Retry::Timeout`].
	 * 
	 * [`PaymentParameters::expiry_time`]: crate::routing::router::PaymentParameters::expiry_time
	 */
	LDKRetryableSendFailure_PaymentExpired,
	/**
	 * We were unable to find a route to the destination.
	 */
	LDKRetryableSendFailure_RouteNotFound,
	/**
	 * Indicates that a payment for the provided [`PaymentId`] is already in-flight and has not
	 * yet completed (i.e. generated an [`Event::PaymentSent`] or [`Event::PaymentFailed`]).
	 * 
	 * [`PaymentId`]: crate::ln::channelmanager::PaymentId
	 * [`Event::PaymentSent`]: crate::util::events::Event::PaymentSent
	 * [`Event::PaymentFailed`]: crate::util::events::Event::PaymentFailed
	 */
	LDKRetryableSendFailure_DuplicatePayment,
	; static native void init();
	static { init(); }
}