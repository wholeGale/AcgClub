package com.rabtman.acgschedule.mvp.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.rabtman.acgschedule.R;
import com.rabtman.acgschedule.mvp.model.jsoup.ScheduleDetail.ScheduleEpisode;
import java.util.List;

/**
 * @author Rabtman
 */

public class ScheduleDetailEpisodeItemAdapter extends
    BaseQuickAdapter<ScheduleEpisode, BaseViewHolder> {

  public ScheduleDetailEpisodeItemAdapter(List<ScheduleEpisode> data) {
    super(R.layout.acgschedule_item_schedule_detail_episode, data);
  }

  @Override
  protected void convert(BaseViewHolder helper, ScheduleEpisode item) {
    helper.setText(R.id.tv_sd_episode_name, item.getName());
  }
}