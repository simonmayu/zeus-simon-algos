package zeus.simon.algos.algos01and10;

/**
 * 判断回文字符串
 * 字符串里只考虑字母和数字忽略其他字符串,另外，对于字母，可以忽略大小写
 */
public class Algos01 {

    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    private boolean isEqualsIgnoreCase(char a, char b) {
        if (a >= 'A' && a <= 'Z') a += 32;
        if (b >= 'A' && b <= 'Z') b += 32;
        return a == b;
    }

    // Time:O(n) ,Space:O(1)
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;

        for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            while (i < j && !isAlphanumeric(s.charAt(i))) ++i;
            while (i < j && !isAlphanumeric(s.charAt(j))) --j;
            if (i < j && !isEqualsIgnoreCase(s.charAt(i), s.charAt(j))) return false;
        }
        return true;
    }
}
