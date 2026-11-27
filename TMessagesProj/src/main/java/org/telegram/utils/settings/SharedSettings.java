package org.telegram.utils.settings;

import org.telegram.messenger.BuildConfig;
import org.telegram.ui.ActionBar.SimpleActionBarDoneButton;
import org.telegram.utils.recorder.round.RoundVideoSession;
import org.telegram.utils.recorder.audio.AudioRecordingSession;

public final class SharedSettings {

    public static final BooleanSetting experimentalSettingsAllowed =
        BooleanSetting.of("experimental_settings_allowed", BuildConfig.DEBUG_VERSION);

    public static final BooleanSetting audioRecorderV2Enabled =
        BooleanSetting.of("audio_recorder_v2_enabled", BuildConfig.DEBUG_VERSION);

    public static final EnumSetting<AudioRecordingSession.NoiseSuppression> audioRecorderNoiseSuppression =
        EnumSetting.of("audio_recorder_noise_suppression", AudioRecordingSession.NoiseSuppression.DISABLED);

    public static final BooleanSetting roundVideoCamera2Enabled =
        BooleanSetting.of("round_video_camera2_enabled", BuildConfig.DEBUG_VERSION);

    public static final EnumSetting<RoundVideoSession.OutputResolution> roundVideoOutputResolution =
        EnumSetting.of("round_video_output_resolution", RoundVideoSession.OutputResolution.P480);

    public static final EnumSetting<RoundVideoSession.CameraResolution> roundVideoCameraResolution =
        EnumSetting.of("round_video_camera_resolution", RoundVideoSession.CameraResolution.HIGH);

    public static final EnumSetting<RoundVideoSession.FrameRate> roundVideoFrameRate =
        EnumSetting.of("round_video_frame_rate", RoundVideoSession.FrameRate.FPS_30);

    public static final IntSetting roundVideoVideoBitrate =
        IntSetting.of("round_video_video_bitrate", 1_200_000);

    public static final BooleanSetting roundVideoComposition =
        BooleanSetting.of("round_video_composition", true);

    public static final EnumSetting<RoundVideoSession.CameraFacing> roundVideoLastCamera =
        EnumSetting.of("round_video_last_camera", RoundVideoSession.CameraFacing.FRONT);

    public static final EnumSetting<SimpleActionBarDoneButton.Style> headerDoneButtonStyle =
        EnumSetting.of("header_done_button_style", SimpleActionBarDoneButton.Style.GLASS);

    public static final EnumSetting<SimpleActionBarDoneButton.Shape> headerDoneButtonShape =
        EnumSetting.of("header_done_button_shape", SimpleActionBarDoneButton.Shape.TEXT);

    public static final BooleanSetting benchGramGhostStories =
        BooleanSetting.of("benchgram_ghost_stories", true);

    public static final BooleanSetting benchGramSaveStories =
        BooleanSetting.of("benchgram_save_stories", true);

    public static final BooleanSetting benchGramSaveDeletedMessages =
        BooleanSetting.of("benchgram_save_deleted_messages", true);

    public static final BooleanSetting benchGramSaveViewOnceMedia =
        BooleanSetting.of("benchgram_save_view_once_media", true);

    public static final BooleanSetting benchGramGhostRead =
        BooleanSetting.of("benchgram_ghost_read", true);

    public static final BooleanSetting benchGramGhostTyping =
        BooleanSetting.of("benchgram_ghost_typing", true);

    public static final BooleanSetting benchGramGhostOnline =
        BooleanSetting.of("benchgram_ghost_online", true);

    public static final BooleanSetting benchGramTrackOnlineStatus =
        BooleanSetting.of("benchgram_track_online_status", true);

    private SharedSettings() {
    }
}
