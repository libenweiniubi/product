package com.calb.es.utils;

public class ByteUtil {
    private static final char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /**
     * 方法四：byte[]-->hexString
     *
     * @param bytes
     * @return
     */

    public static String toHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
// 使用String的format方法进行转换
        for (byte b : bytes) {
            Integer value = b & 0xff;
            sb.append(String.format("%02x", value));
        }
        return sb.toString();
    }

    public static byte[] fromHexString(String var0) {
        char[] var1 = var0.toUpperCase().toCharArray();
        int var2 = 0;

        for (int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] >= '0' && var1[var3] <= '9' || var1[var3] >= 'A' && var1[var3] <= 'F') {
                ++var2;
            }
        }

        byte[] var6 = new byte[var2 + 1 >> 1];
        int var4 = var2 & 1;

        for (int var5 = 0; var5 < var1.length; ++var5) {
            if (var1[var5] >= '0' && var1[var5] <= '9') {
                var6[var4 >> 1] = (byte) (var6[var4 >> 1] << 4);
                var6[var4 >> 1] = (byte) (var6[var4 >> 1] | var1[var5] - 48);
            } else {
                if (var1[var5] < 'A' || var1[var5] > 'F') {
                    continue;
                }

                var6[var4 >> 1] = (byte) (var6[var4 >> 1] << 4);
                var6[var4 >> 1] = (byte) (var6[var4 >> 1] | var1[var5] - 65 + 10);
            }

            ++var4;
        }

        return var6;
    }

}
