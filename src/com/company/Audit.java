package com.company;

public interface Audit {
    static boolean permit(long acctNumber, double balance) {
        return AuditStub.permit(acctNumber, balance);
    }
}
