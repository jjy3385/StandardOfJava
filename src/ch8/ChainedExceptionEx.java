package ch8;

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(se);
            throw ie;
//        } catch (MemoryException me) {
        } catch (RuntimeException me) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    //    static void startInstall() throws SpaceException, MemoryException {
    static void startInstall() throws SpaceException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다");
        }

        if (!enoughMemory()) {
//            throw new MemoryException("메모리가 부족합니다");
            throw new RuntimeException(new MemoryException("메모리가 부족합니다"));
        }
    }

    static void copyFiles() {
        //파일복사 코드
    }

    static void deleteTempFiles() {
        //임시파일 삭제 코드
    }

    static boolean enoughSpace() {
        //설치공간 있는지 확인하는 코드
        return true;
    }

    static boolean enoughMemory() {
        //설치 메모리 있는지 확인하는 코드
        return false;
    }
}


class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
