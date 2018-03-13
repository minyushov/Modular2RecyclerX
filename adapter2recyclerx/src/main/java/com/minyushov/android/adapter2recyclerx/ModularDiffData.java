package com.minyushov.android.adapter2recyclerx;

import android.support.v7.util.DiffUtil;

import java.util.List;

import javax.annotation.Nullable;

public final class ModularDiffData {
  public final List<ModularDiffItem> items;
  @Nullable
  public final DiffUtil.DiffResult diff;

  public ModularDiffData(List<ModularDiffItem> items, @Nullable DiffUtil.DiffResult diff) {
    this.items = items;
    this.diff = diff;
  }
}