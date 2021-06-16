package com.company;

class AuditStub implements Audit {
    public static boolean permit(long acctNumber, double balance) {
        return true;
    }
}
