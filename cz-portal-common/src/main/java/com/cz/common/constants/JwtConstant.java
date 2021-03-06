package com.cz.common.constants;

/**
 * Created by jomalone_jia on 2017/7/24.
 */
public class JwtConstant {
    public static final Long EXPIRATION = 60 * 60 * 12L;
    public static final Integer CAN_REFRESH_MINUTES = 30;
    public static final String SECRET = "jomalone";
    public static final String CLAIM_KEY_USERNAME = "sub";
    public static final String CLAIM_KEY_AUDIENCE = "audience";
    public static final String CLAIM_KEY_CREATED = "created";
    public static final String CLAIM_KEY_EXPIRED = "exp";
    public static final String AUDIENCE_UNKNOWN = "unknown";
    public static final String AUDIENCE_WEB = "web";
    public static final String AUDIENCE_MOBILE = "mobile";
    public static final String AUDIENCE_TABLET = "tablet";

}
