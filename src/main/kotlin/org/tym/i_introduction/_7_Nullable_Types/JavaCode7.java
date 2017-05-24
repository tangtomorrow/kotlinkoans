package org.tym.i_introduction._7_Nullable_Types;

import i_introduction._7_Nullable_Types.Client;
import i_introduction._7_Nullable_Types.Mailer;
import i_introduction._7_Nullable_Types.PersonalInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tym.util.JavaCode;

public class JavaCode7 extends JavaCode {
    public void sendMessageToClient(@Nullable Client client, @Nullable String message, @NotNull Mailer mailer) {
        if (client == null || message == null) return;

        PersonalInfo personalInfo = client.getPersonalInfo();
        if (personalInfo == null) return;

        String email = personalInfo.getEmail();
        if (email == null) return;

        mailer.sendMessage(email, message);
    }
}
